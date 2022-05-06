package com.simsek.vale.domain;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public  abstract class  BaseDomain  {


//    @CreatedBy
//    private String createdBy;

    @CreatedDate
    private LocalDateTime creationDate;

//    @LastModifiedBy
//    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

//    public String getCreatedBy() {
//        return createdBy;
//    }

//    public void setCreatedBy(String createdBy) {
//        this.createdBy = createdBy;
//    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

//    public String getLastModifiedBy() {
//        return lastModifiedBy;
//    }
//
//    public void setLastModifiedBy(String lastModifiedBy) {
//        this.lastModifiedBy = lastModifiedBy;
//    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
