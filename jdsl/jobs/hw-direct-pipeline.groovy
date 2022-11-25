pipelineJob('example') {
  definition {
    cps {
      script(readFileFromWorkspace('scripts', 'hw-direct-pipeline.Jenkinsfile'))
      sandbox()
    }
  }
}