package com.invoiceprocess.server.dao;

import com.invoiceprocess.server.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<Invoice,Long> {

}
