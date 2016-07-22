package davenkin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ShowTimeTask extends DefaultTask {
	@TaskAction
	def showTimeTask(){
		println "Current time is " + new Date().format(project.dateAndTime.timeFormat)
	}
}