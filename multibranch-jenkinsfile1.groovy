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
        echo "printing ${PIPE_LEVEL_VAR} from merge-conflict branch"
        echo "printing ${PIPE_LEVEL_VAR} from main branch"
      }
    }
  }
}
