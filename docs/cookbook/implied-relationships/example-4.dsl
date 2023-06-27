workspace {

    model {
        u = person "User"
        s = softwareSystem "Software System" {
            webapp = container "Web Application"
        }

        u -> s "Uses 1"
        u -> s "Uses 2"
        u -> webapp "Uses 1"
        u -> webapp "Uses 2"
    }

    views {
        systemContext s {
            include *
            autoLayout lr
        }
    }
    
}