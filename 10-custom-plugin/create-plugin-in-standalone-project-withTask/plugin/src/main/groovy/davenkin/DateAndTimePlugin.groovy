package davenkin

import org.gradle.api.Plugin
import org.gradle.api.Project
import davenkin.ShowTimeTask
import davenkin.ShowDateTask

class DateAndTimePlugin implements Plugin<Project> {
    void apply(Project project) {

        project.extensions.create("dateAndTime", DateAndTimePluginExtension)
		
		project.task('showTime', type: ShowTimeTask);
		project.task('showDate', type: ShowDateTask);
    }
}