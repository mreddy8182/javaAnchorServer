package me.kroeker.alex.anchor.jserver.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import me.kroeker.alex.anchor.jserver.model.CaseSelectCondition;
import me.kroeker.alex.anchor.jserver.model.Rule;
import me.kroeker.alex.anchor.jserver.api.RuleApi;

/**
 * @author ak902764
 */
@RestController
public class RuleController implements RuleApi {

    @Override
    @RequestMapping(value = "/{connectionName}/rule/{modelId}/{frameId}", method = RequestMethod.POST, produces = {
            "application/json" })
    public Rule createRule(@PathVariable String connectionName, @PathVariable String modelId, @PathVariable String frameId,
                           Collection<CaseSelectCondition> conditions) {
        return null;
    }

}
