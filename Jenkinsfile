pipeline {
    agent { 
        node {
            label 'jenkins-slave'
            }
      }
    stages{
        stage('Build'){
            steps{
                echo "Hello World"
            }
        }
        stage('Test'){
            steps{
                echo "Testing"
            }
        }
        stage('Deploy'){
            steps{
                echo "Deployed"
            }
        }
    }
}
