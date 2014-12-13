/*
 * PaLNote
 * http://palnote.org
 *
 * Copyright (c) 2014 Ayana Tokikaze. All rights reserved.
 * 　Released under the Apache v2 License.
 *
 * Created by Ayana Tokikaze on 14/09/24.
 */
package net.snvx.palnote.core;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import net.snvx.palnote.core.ui.AboutAppWindow;

public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("PaLNote");
    VBox vBox = new VBox();
    primaryStage.setScene(new Scene(vBox, 800, 600));

    //メニューバー
    MenuBar menuBar = new MenuBar();

    Menu menuPaLNote = new Menu("PaLNote");
    MenuItem aboutApp = new MenuItem("About PaLNote");
    aboutApp.setOnAction((event) -> {
              Stage aboutStage = new AboutAppWindow();
              aboutStage.show();
            }
    );

    MenuItem preferences = new MenuItem("Preferences...");
    MenuItem quitApplication = new MenuItem("Quit");
    quitApplication.setOnAction((event) -> Platform.exit());
    menuBar.isUseSystemMenuBar();
    menuPaLNote.getItems().addAll(aboutApp, preferences, quitApplication);

    Menu menuFile = new Menu("File");
    MenuItem newFile = new MenuItem("New");
    MenuItem openFile = new MenuItem("Open");
    MenuItem close = new MenuItem("Close");

    menuFile.getItems().addAll(newFile, openFile, close);

    Menu menuEdit = new Menu("Edit");
    MenuItem undo = new MenuItem("Undo");
    MenuItem redo = new MenuItem("Redo");
    SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
    menuEdit.getItems().addAll(undo, redo, separatorMenuItem);

    Menu menuView = new Menu("View");
    Menu menuCode = new Menu("Code");
    menuBar.getMenus().addAll(menuPaLNote, menuFile, menuEdit, menuView, menuCode);

    ToolBar toolBar = new ToolBar();

    Button generalButton = new Button("General");
    generalButton.setContentDisplay(ContentDisplay.TOP);

    Button pluginButton = new Button("Plugins");
    pluginButton.setContentDisplay(ContentDisplay.TOP);

    Button editorButton = new Button("Editor");
    editorButton.setContentDisplay(ContentDisplay.TOP);

    toolBar.getItems().addAll(generalButton, pluginButton, editorButton);
    vBox.getChildren().addAll(menuBar, toolBar);
    primaryStage.show();
  }
}