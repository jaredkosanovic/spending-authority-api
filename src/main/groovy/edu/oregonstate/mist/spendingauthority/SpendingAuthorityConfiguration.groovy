package edu.oregonstate.mist.spendingauthority

import com.fasterxml.jackson.annotation.JsonProperty
import edu.oregonstate.mist.api.Configuration
import io.dropwizard.db.DataSourceFactory

import javax.validation.Valid
import javax.validation.constraints.NotNull

class SpendingAuthorityConfiguration extends Configuration {

    @Valid
    @NotNull
    @JsonProperty("database")
    DataSourceFactory database = new DataSourceFactory()

    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory() {
        database
    }

    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
        this.database = dataSourceFactory
    }
}