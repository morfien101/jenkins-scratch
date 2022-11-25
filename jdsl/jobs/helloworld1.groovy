folder('jobs'){
  displayName('Jobs')
    description('Build jobs folder')
}
multibranchPipelineJob('jobs/jenkins-scratch-hw1') {
  displayName("Hello World 1")
  description("Build job for hello world 1")
  branchSources {
    git {
      id('cc0c52c42e584f1f8081cf50f8e116cf') // IMPORTANT: use a constant and unique identifier
      remote('https://github.com/morfien101/jenkins-scratch-hw1')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(20)
    }
  }
  configure {
    it / factory(class: 'org.jenkinsci.plugins.workflow.multibranch.WorkflowBranchProjectFactory') {
        owner(class: 'org.jenkinsci.plugins.workflow.multibranch.WorkflowMultiBranchProject', reference: '../..')
        scriptPath("Jenkinsfile")
    }
  }
}