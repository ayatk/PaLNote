/*
 * PaLNote
 * http://palnote.org
 *
 * Copyright (c) 2014 Ayana Tokikaze. All rights reserved.
 * 　Released under the Apache v2 License.
 *
 * Created by Ayana Tokikaze on 14/10/01.
 */
package net.snvx.palnote.core.ui;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * MainWindowClass
 */
public class MainWindow {
  private Scene Window = null;

  private static int WINDOW_WIDTH = 600;
  private static int WINDOW_HEIGHT = 500;

  public void mainWindow(Stage stage) {
    VBox root = new VBox();
    this.Window = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.WHITE);

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

    MenuItem quitApplication = new MenuItem("QuitApplication");
    quitApplication.setOnAction((event) -> Platform.exit());

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


    root.getChildren().addAll(menuBar);

  }
}
