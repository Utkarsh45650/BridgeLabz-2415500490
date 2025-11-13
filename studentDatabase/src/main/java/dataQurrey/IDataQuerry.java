package dataQurrey;

import java.sql.*;
import connections.Connections.*;

public interface IDataQuerry {
	
	void DisplayData() throws SQLException;
	void CreateTable() throws SQLException;
	void InsertSingleData()throws SQLException;
	void InsertMultipleData() throws SQLException;
	void DeleteSingleData()throws SQLException;
	void DeleteMultipleData() throws SQLException;
	void UpdateSingleData() throws SQLException;
	void UpdateMultipleData() throws SQLException;
}	
