pipelineJob('jobs/deployers/direct-pipeline') {
  definition {
    cps {
      script(readFileFromWorkspace('scripts', 'hw_direct_pipeline.Jenkinsfile'))
      sandbox()
    }
  }
}