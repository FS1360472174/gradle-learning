package davenkin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ShowDateTask extends DefaultTask {
	@TaskAction
	def showDateTask(){
		println "Current date is " + new Date().format(project.dateAndTime.dateFormat)
	}
}
