griffon.project.dependency.resolution = {
    inherits("global")
    log "warn"
    repositories {
        griffonHome()
        mavenCentral()
        mavenRepo 'http://repository.codehaus.org'
        mavenRepo 'http://repository.sonatype.org/content/groups/public'
        mavenRepo 'https://repository.jboss.org/nexus/content/groups/public-jboss'
    }
    dependencies {
        String gfxBuilderVersion = '0.7.1'
        compile("org.codehaus.griffon:gfxbuilder-core:$gfxBuilderVersion",
                "org.codehaus.griffon:gfxbuilder-svg:$gfxBuilderVersion",
                "org.codehaus.griffon:gfxbuilder-swingx:$gfxBuilderVersion") {
            excludes 'groovy-all'
        }
    }
}

griffon {
    doc {
        logo = '<a href="http://griffon.codehaus.org" target="_blank"><img alt="The Griffon Framework" src="../img/griffon.png" border="0"/></a>'
        sponsorLogo = "<br/>"
        footer = "<br/><br/>Made with Griffon (0.9)"
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}
