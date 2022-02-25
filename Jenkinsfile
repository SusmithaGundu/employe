pipeline{
 agent any
  stages{
     stage('Build and tag'){
       steps{
          sh 'docker build -t susmithagundu/repo1:Employe .'
        }
      }
     stage('Publish'){
       steps{
         withDockerRegistry([ credentialsId: "dockerhub", url: "" ]) {
           sh 'docker push susmithagundu/repo1:Employe'
           }
         }
       }
   }
}
