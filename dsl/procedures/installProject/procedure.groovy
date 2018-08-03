import java.io.File

def procName = 'installProject'
procedure procName, {

	//evalDsl the main.groovy if it exists
	step 'deployProject',
    command: new File(pluginDir, "dsl/procedures/$procName/steps/deployProject.groovy").text,
    shell: 'ec-groovy'

	// loop on each project
	step 'projectLoop'
}
