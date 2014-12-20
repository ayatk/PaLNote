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

  protected static final double BUTTON_WIDTH = 80;
  protected static final double BUTTON_HEIGHT = 80;
  protected static final String ICON_PATH = "net/snvx/palnote/resources/images/basic/";

  public PreferencesWindow() {
    initModality(Modality.APPLICATION_MODAL);
    initStyle(StageStyle.DECORATED);

    VBox vbox = new VBox();
    vbox.setPrefSize(800, 600);
    ToolBar toolBar = new ToolBar();

    Button generalButton = new Button("General");
    generalButton.setGraphic(new ImageView(ICON_PATH + "ic_dashboard_white_24dp.png"));
    generalButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
    generalButton.setContentDisplay(ContentDisplay.TOP);

    Button editorButton = new Button("Editor");
    editorButton.setGraphic(new ImageView(ICON_PATH + "ic_create_white_24dp.png"));
    editorButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
    editorButton.setContentDisplay(ContentDisplay.TOP);

    Button snippetButton = new Button("Snippet");
    snippetButton.setGraphic(new ImageView(ICON_PATH + "ic_functions_white_24dp.png"));
    snippetButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
    snippetButton.setContentDisplay(ContentDisplay.TOP);

    Button languageButton = new Button("Language");
    languageButton.setGraphic(new ImageView(ICON_PATH + "ic_language_white_24dp.png"));
    languageButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
    languageButton.setContentDisplay(ContentDisplay.TOP);

    toolBar.getItems().addAll(generalButton, editorButton, snippetButton, languageButton);

    vbox.getChildren().addAll(toolBar);
    Scene scene = new Scene(vbox);
    setScene(scene);
  }
}
