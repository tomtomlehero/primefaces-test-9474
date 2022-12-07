package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;
    
    @PostConstruct  
    public void init() {
        string = "Welcome to PrimeFaces!!!";
    }



    public boolean isRendered() {
        return false;
    }

    public List<String> getCountries() {
        return Arrays.asList("Argentina", "Australia", "Brazil", "Canada");
    }

    public List<String> getColumns() {

        if (!isRendered()) {
            log.error("You should never read this");
        }
        return Arrays.asList("Countries");
    }

}
