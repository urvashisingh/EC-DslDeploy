import groovy.transform.BaseScript
import com.electriccloud.commander.dsl.util.BaseProject

//noinspection GroovyUnusedAssignment
@BaseScript BaseProject baseScript

// Variables available for use in DSL code
def projectName = '$[projName]'
def projectDir = '$[projDir]'

def relNbr

project projectName, {
  relNbr  = loadReleases(projectDir, projectName)
}

def summaryStr = relNbr?  "Created $relNbr releases" : "No release"
setProperty(propertyName: "summary", value: summaryStr)
