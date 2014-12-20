/*
 * PaLNote
 * 
 * Copyright (c) 2014 Ayana Tokikaze. All rights reserved.
 * 　Released under the Apache v2 License.
 *  
 * Created by Ayana Tokikaze on 14/12/17.
 */
package net.snvx.palnote.core.plugin;

/**
 * An object that can get the information of the plugin.
 */
public interface PluginInfo {

  /**
   * @return Plugin name
   */
  String name();

  /**
   * @return Plugin version
   */
  String version();

  /**
   * @return Author name
   */
  String author();

  /**
   * @return Plugin description
   */
  String description();

  /**
   * @return Author's email address
   */
  String email();

  /**
   * @return Homepage URL
   */
  String homepage();

  /**
   * @return Software license
   */
  String licenses();

  /**
   * @return Plugin repository
   */
  String repository();

  /**
   * @return Plugin searching keywords
   */
  String keywords();
}
