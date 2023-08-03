pipeline {
  agent any
  tools {
    maven 'maven-3.6.3' 
  }
  stages {
    stage('Git Checkout') {
      steps {
        git branch: 'main', credentialsId: 'gitcheckout2', url:'https://github.com/amitrathi8848/authorizationserver'
      }
    }
    stage ('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
  }
}