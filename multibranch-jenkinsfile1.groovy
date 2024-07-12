pipeline{
  agent any
  environment
  {
    PIPE_LEVEL_VAR= "PIPELINE_LEVEL_VARIABLE"
  }
  stages{
    stage('S-1'){
      steps{
        echo "printing ${PIPE_LEVEL_VAR}"
        echo " checking webhook trigger 2 "
        echo " checking webhook trigger 3 "
        echo " checking webhook trigger 4 "
        echo " checking webhook trigger 6 "
        echo " testing merge conflicts"
      }
    }
  }
}
