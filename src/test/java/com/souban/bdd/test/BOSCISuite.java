package com.souban.bdd.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.souban.bdd.steps.JunitHooks;

@RunWith(Suite.class)
@SuiteClasses({ BOSCI.class })
public class BOSCISuite extends JunitHooks {

}
