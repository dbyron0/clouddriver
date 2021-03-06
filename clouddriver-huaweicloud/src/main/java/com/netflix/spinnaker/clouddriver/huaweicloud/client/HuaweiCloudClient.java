/*
 * Copyright 2019 Huawei Technologies Co.,Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.clouddriver.huaweicloud.client;

import com.huawei.openstack4j.model.compute.ext.AvailabilityZone;
import com.huawei.openstack4j.openstack.ecs.v1.domain.Flavor;
import com.huawei.openstack4j.openstack.ims.v2.domain.Image;
import com.huawei.openstack4j.openstack.vpc.v1.domain.SecurityGroup;
import com.huawei.openstack4j.openstack.vpc.v1.domain.Subnet;
import com.huawei.openstack4j.openstack.vpc.v1.domain.Vpc;
import com.netflix.spinnaker.clouddriver.huaweicloud.exception.HuaweiCloudException;
import java.util.List;

public interface HuaweiCloudClient {
  /**
   * List availability zones in a region
   *
   * @param region
   * @return
   */
  List<? extends AvailabilityZone> getZones(String region) throws HuaweiCloudException;

  /**
   * List images in a region
   *
   * @param region
   * @return
   */
  List<? extends Image> getImages(String region) throws HuaweiCloudException;

  /**
   * List instance types in a region
   *
   * @param region
   * @param az
   * @return
   */
  List<? extends Flavor> getInstanceTypes(String region, String az) throws HuaweiCloudException;

  /**
   * List security groups in a region
   *
   * @param region
   * @return
   */
  List<? extends SecurityGroup> getSecurityGroups(String region) throws HuaweiCloudException;

  /**
   * List the available subnets in a region.
   *
   * @param region
   * @return
   */
  List<? extends Subnet> getSubnets(String region) throws HuaweiCloudException;

  /**
   * List the available vpcs in a region.
   *
   * @param region
   * @return
   */
  List<? extends Vpc> getVpcs(String region) throws HuaweiCloudException;
}
