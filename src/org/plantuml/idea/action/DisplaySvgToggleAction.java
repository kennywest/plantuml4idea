package org.plantuml.idea.action;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ToggleAction;
import com.intellij.openapi.project.DumbAware;
import org.plantuml.idea.lang.settings.PlantUmlSettings;

public class DisplaySvgToggleAction extends ToggleAction implements DumbAware {

    @Override
    public boolean isSelected(AnActionEvent anActionEvent) {
        return PlantUmlSettings.getInstance().isDisplaySvg();
    }

    @Override
    public void setSelected(AnActionEvent anActionEvent, boolean b) {
        PlantUmlSettings.getInstance().setDisplaySvg(b);
    }
}