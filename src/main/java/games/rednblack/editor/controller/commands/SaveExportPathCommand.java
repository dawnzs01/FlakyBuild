/*
 * ******************************************************************************
 *  * Copyright 2015 See AUTHORS file.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *****************************************************************************
 */

package games.rednblack.editor.controller.commands;

import games.rednblack.editor.controller.SandboxCommand;
import games.rednblack.editor.proxy.ProjectManager;
import org.puremvc.java.interfaces.INotification;

/**
 * Created by azakhary on 11/12/2015.
 */
public class SaveExportPathCommand extends SandboxCommand {

    @Override
    public void execute(INotification notification) {
        String path = notification.getBody();

        ProjectManager projectManager = facade.retrieveProxy(ProjectManager.NAME);
        projectManager.setExportPaths(path);
        projectManager.saveCurrentProject();
    }
}
