package com.souban.bdd.test.pipeline.web;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.souban.bdd.steps.JunitHooks;

@RunWith(Suite.class)
@SuiteClasses({ CreamsWebSettingsCi.class })
public class CreamsWebSettingsCISuite extends JunitHooks {

}
