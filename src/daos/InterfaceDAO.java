/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;

/**
 *
 * @author budiarti
 */
public interface InterfaceDAO {
    public boolean executeDML(String query);
    public List<Object[]> getDatas(String query);
    public Object getDataBy(String query);
    public String getAutoId(String query);
}
