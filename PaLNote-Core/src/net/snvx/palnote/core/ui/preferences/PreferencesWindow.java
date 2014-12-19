/*
 * PaLNote
 * 
 * Copyright (c) 2014 Ayana Tokikaze. All rights reserved.
 * 　Released under the Apache v2 License.
 *  
 * Created by Ayana Tokikaze on 14/12/17.
 */
package net.snvx.palnote.core.ui.preferences;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PreferencesWindow extends Stage {
  public PreferencesWindow() {
    initModality(Modality.APPLICATION_MODAL);
    initStyle(StageStyle.DECORATED);

    VBox vbox = new VBox();
    vbox.setPrefSize(800, 600);
    ToolBar toolBar = new ToolBar();

    Button generalButton = new Button("General");
    generalButton.setGraphic(new ImageView("net/snvx/palnote/resources/images/basic/ic_dashboard_white_24dp.png"));
    generalButton.setPrefSize(80, 80);
    generalButton.setContentDisplay(ContentDisplay.TOP);

    Button editorButton = new Button("Editor");
    editorButton.setGraphic(new ImageView("net/snvx/palnote/resources/images/basic/ic_create_white_24dp.png"));
    editorButton.setPrefSize(80, 80);
    editorButton.setContentDisplay(ContentDisplay.TOP);

    Button snippetButton = new Button("Snippet");
    snippetButton.setGraphic(new ImageView("net/snvx/palnote/resources/images/basic/ic_functions_white_24dp.png"));
    snippetButton.setPrefSize(80, 80);
    snippetButton.setContentDisplay(ContentDisplay.TOP);

    Button languageButton = new Button("Language");
    languageButton.setGraphic(new ImageView("net/snvx/palnote/resources/images/basic/ic_language_white_24dp.png"));
    languageButton.setPrefSize(80, 80);
    languageButton.setContentDisplay(ContentDisplay.TOP);

    toolBar.getItems().addAll(generalButton, editorButton, snippetButton, languageButton);

    vbox.getChildren().addAll(toolBar);
    Scene scene = new Scene(vbox);
    setScene(scene);
  }
}
