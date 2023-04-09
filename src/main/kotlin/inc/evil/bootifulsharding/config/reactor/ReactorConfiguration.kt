package inc.evil.bootifulsharding.config.reactor

import org.springframework.context.annotation.Profile
import reactor.core.publisher.Hooks

@Profile("!prod")
class ReactorConfiguration {
    init {
        Hooks.onOperatorDebug()
    }
}

