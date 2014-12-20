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
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import net.snvx.palnote.core.ui.AboutAppWindow;
import net.snvx.palnote.core.ui.preferences.PreferencesWindow;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

public class Main extends Application {

  protected static final double BUTTON_WIDTH = 40;
  protected static final double BUTTON_HEIGHT = 35;
  protected static final String ICON_PATH = "net/snvx/palnote/resources/images/basic/";

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("PaLNote");
    VBox vBox = new VBox();
    primaryStage.setScene(new Scene(vBox, 1200, 800));

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
    preferences.setOnAction((event) -> {
              Stage preferencesStage = new PreferencesWindow();
              preferencesStage.show();
            }
    );
    MenuItem quitApplication = new MenuItem("Quit");
    quitApplication.setOnAction((event) -> Platform.exit());
    menuBar.setUseSystemMenuBar(true);
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

    Button saveButton = new Button();
    saveButton.setGraphic(new ImageView(ICON_PATH + "ic_save_white_24dp.png"));
    saveButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

    Button undoButton = new Button();
    undoButton.setGraphic(new ImageView(ICON_PATH + "ic_undo_white_24dp.png"));
    undoButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

    Button redoButton = new Button();
    redoButton.setGraphic(new ImageView(ICON_PATH + "ic_redo_white_24dp.png"));
    redoButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

    Button copyButton = new Button();
    copyButton.setGraphic(new ImageView(ICON_PATH + "ic_content_copy_white_24dp.png"));
    copyButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

    Button consoleButton = new Button();
    consoleButton.setGraphic(new ImageView(ICON_PATH + "console_white.png"));
    consoleButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

    Button settingButton = new Button();
    settingButton.setGraphic(new ImageView(ICON_PATH + "ic_settings_white_24dp.png"));
    settingButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
    settingButton.setOnAction((event) -> {
              Stage preferencesStage = new PreferencesWindow();
              preferencesStage.show();
            }
    );

    Button bugReportButton = new Button();
    bugReportButton.setGraphic(new ImageView(ICON_PATH + "ic_bug_report_white_24dp.png"));
    bugReportButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

    Button helpButton = new Button();
    helpButton.setGraphic(new ImageView(ICON_PATH + "ic_help_white_24dp.png"));
    helpButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

    Button searchButton = new Button();
    searchButton.setGraphic(new ImageView(ICON_PATH + "ic_search_white_24dp.png"));
    searchButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

    toolBar.getItems().addAll(
            saveButton,
            undoButton,
            redoButton,
            copyButton,
            consoleButton,
            settingButton,
            bugReportButton,
            helpButton,
            searchButton
    );

    HBox hBox = new HBox();
    vBox.setVgrow(hBox, Priority.ALWAYS);
    CodeArea codeArea = new CodeArea();
    codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
    HBox.setHgrow(codeArea, Priority.ALWAYS);

    hBox.getChildren().addAll(codeArea);
    vBox.getChildren().addAll(menuBar, toolBar, hBox);
    primaryStage.show();
  }
}