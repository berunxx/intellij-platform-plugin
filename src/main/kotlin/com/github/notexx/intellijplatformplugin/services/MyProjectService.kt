package com.github.notexx.intellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.notexx.intellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
