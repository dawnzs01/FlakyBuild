workspace {

    !impliedRelationships false

    model {

        u = person "User"
        s = softwareSystem "Software System" {
            webapp = container "Web Application"
        }

        u -> webapp "Uses"
    }

    views {
        systemContext s {
            include u s
            autoLayout
        }
    }
    
}