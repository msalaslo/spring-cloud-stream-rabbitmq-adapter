package com.verisure.integration.amqpadapter.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verisure.integration.amqpadapter.domain.entity.ApplicationItem;
import com.verisure.integration.amqpadapter.domain.repository.ApplicationRepository;
import com.verisure.integration.amqpadapter.service.ApplicationService;

import java.util.List;

/**
 * Sample service implementation.
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@Service
@Slf4j
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public void createApplicationItem(ApplicationItem applicationItem) {
        applicationRepository.save(applicationItem);
    }

    @Override
    public List<ApplicationItem> getApplicationItems() {
      return applicationRepository.findAll();
    }


}
