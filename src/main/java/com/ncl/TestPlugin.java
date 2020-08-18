package com.ncl;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="test",defaultPhase = LifecyclePhase.PACKAGE)
public class TestPlugin extends AbstractMojo {
    @Parameter
    private String port;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("============================="+port);
    }
}
