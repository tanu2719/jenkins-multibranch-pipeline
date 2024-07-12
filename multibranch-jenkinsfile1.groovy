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
        echo "testing merge conflict"
        echo "testing merge conflict"
        echo "new"
      }
    }
  }
}
