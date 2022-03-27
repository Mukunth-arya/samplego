pipeline {
    agent any

    stages {
        stage('gcl') {
            steps {
                 git credentialsId: 'jenkinslogin',
                 url: 'https://github.com/Mukunth-arya/samplego'  
            }
            
        }
        
        stage('dpsh') {
            steps{
                ansiblePlaybook credentialsId: 'Mukunth-arya', 
                disableHostKeyChecking: true, 
                installation: 'ansible', 
                playbook: '1.yaml'
            }
        }
        //stage('imkube') {
            //steps{
               //ansiblePlaybook credentialsId: 'Mukunth-arya', 
               //disableHostKeyChecking: true, 
               //installation: 'ansible', 
               //inventory: 'my.inv', 
               //playbook: '2.yaml' 
            //}
        //}
        stage('clstrt') {
            steps{
                ansiblePlaybook credentialsId: 'Mukunth-arya', 
                disableHostKeyChecking: true, 
                installation: 'ansible', 
                inventory: 'my.inv', 
                playbook: '3.yaml'
                
            }
        }        
        
        
        
        
        
        
        
        
    }
    
}
