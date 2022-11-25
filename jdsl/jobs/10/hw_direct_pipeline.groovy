pipelineJob('jobs/deployers/direct-pipeline') {
  displayName('Deployer')
  description('Does Nothing!')
  definition {
    cps {
      script(readFileFromWorkspace('jdsl/scripts/hw_direct_pipeline.Jenkinsfile'))
      sandbox()
    }
  }
}