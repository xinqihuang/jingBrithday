/*
 * Copyright (c) 2016.
 * this is a website to dongzijing by huangxinqi
 */

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by huangxinqi on 2016/12/6/0006.
 */
public class VerySimpleLeaveProcessTest {
    @Test
    public void testStartProcess() throws Exception{
        ProcessEngine processEngine=ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration().buildProcessEngine();
        RepositoryService repositoryService=processEngine.getRepositoryService();
        repositoryService.createDeployment().addClasspathResource("./leave.bpmn.xml").deploy();
        ProcessDefinition processDefinition=repositoryService.createProcessDefinitionQuery().singleResult();
        assertEquals("leavesayhello",processDefinition.getKey());
        RuntimeService runtimeService=processEngine.getRuntimeService();
        ProcessInstance processInstance=runtimeService.startProcessInstanceByKey("leavesayhello");
        assertNotNull(processInstance);
        System.out.println("pid="+processInstance.getId()+",pdid="+processInstance.getProcessDefinitionId());
    }
}
