package com.sanda.base.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.sanda.base.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
