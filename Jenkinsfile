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
