package com.netflix.priam.aws;

import com.netflix.priam.identity.PriamInstance;
import java.util.Optional;

/** Derives public ip from hostname. */
public interface IPConverter {
    Optional<String> getPublicIP(PriamInstance instance);
}
