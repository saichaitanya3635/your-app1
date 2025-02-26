pipeline {
    agent { label 'test-agent' }  // Ensure the agent is correctly configured
    tools {
        maven 'Maven-3.9.9'  // Matches the name in Global Tool Configuration
    }

    stages {
        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }

        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Build with Maven (Skip Tests)') {
            steps {
                bat 'echo MAVEN_HOME=%MAVEN_HOME%'
                bat 'echo PATH=%PATH%'
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                bat 'start /B java -jar target/simple-microservice-1.0-SNAPSHOT.jar'  // Runs in the background
            }
        }
    }

    post {
        success {
            echo 'Build and deployment successful!'
        }
        failure {
            echo 'Build failed. Check logs.'
        }
    }
}
