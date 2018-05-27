package com.souban.bdd.test.CreamsAPPRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.souban.bdd.steps.JunitHooks;

@RunWith(Suite.class)
@SuiteClasses({ CreamsAPPIOSRunner.class })
public class CreamsAPPIOSSuite extends JunitHooks {

}
