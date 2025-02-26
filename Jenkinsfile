pipeline {
    agent { label 'test-agent' }

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
                echo %MAVEN_HOME%
                echo %PATH%

                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                 bat 'start java -jar target/*.jar'
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
