/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensimkit.extensions;

import java.util.ArrayList;
import net.xeoh.plugins.base.Plugin;

/**
 *
 * @author ahmedmaawy
 */
public interface ExtensionInterface extends Plugin {
    public boolean preSave(ArrayList<String> messages);
    public boolean postSave(ArrayList<String> messages);
}
