package ru.itbirds.trades.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import ru.itbirds.trades.model.CompanyChart;
import ru.itbirds.trades.model.CompanyStock;

@Dao
public interface TradesDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCompanyStock(CompanyStock companyStock);

    @Query("SELECT * FROM CompanyStock WHERE type = :string")
    LiveData<CompanyStock> getCompanyStock(String string);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCompanyChart(CompanyChart companyChart);

    @Query("SELECT * FROM CompanyChart WHERE symbol = :string")
    LiveData<CompanyChart> getCompanyChart(String string);


}