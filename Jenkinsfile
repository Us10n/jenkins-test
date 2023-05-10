pipeline {
    agent {
        node {
            label 'docker-cloud-agent-java'
        }
    }
    triggers {
        pollSCM '*/2 * * * *'
    }
    stages {
         stage('Prepare') {
            steps {
                script {
                    sh('chmod u+x gradlew')
                    sh('java -version')
                    sh('./gradlew --version')
                }
            }
        }
        stage('Build') {
            steps {
                echo "Building.."
                sh '''
                ./gradlew clean build
                '''
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh '''
                cd myapp
                ./gradlew test
                '''
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
                sh '''
                echo "doing delivery stuff.."
                '''
            }
        }
    }
}
