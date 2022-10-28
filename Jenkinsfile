pipeline {
    agent any
    tools {
    maven ('mvn')
  }
    stages {
    	stage('Development') {
    		steps {
    			bat 'mvn clean package'
    		}
    	}
    }
    
 }