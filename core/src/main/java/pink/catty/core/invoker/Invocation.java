/*
 * Copyright 2019 The Catty Project
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pink.catty.core.invoker;

import pink.catty.core.meta.MetaInfo;
import pink.catty.core.service.MethodModel;
import pink.catty.core.service.ServiceModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Invocation {

  private Map<String, Object> attribute = new ConcurrentHashMap<>();

  private MetaInfo metaInfo;

  private ServiceModel serviceModel;

  private MethodModel invokedMethod;

  private Object target;

  public Object getTarget() {
    return target;
  }

  public void setTarget(Object target) {
    this.target = target;
  }

  public MethodModel getInvokedMethod() {
    return invokedMethod;
  }

  public void setInvokedMethod(MethodModel invokedMethod) {
    this.invokedMethod = invokedMethod;
  }

  public MetaInfo getMetaInfo() {
    return metaInfo;
  }

  public ServiceModel getServiceModel() {
    return serviceModel;
  }

  public void setMetaInfo(MetaInfo metaInfo) {
    this.metaInfo = metaInfo;
  }

  public void setServiceModel(ServiceModel serviceModel) {
    this.serviceModel = serviceModel;
  }

  @Override
  public String toString() {
    return invokedMethod.getMethod().toString();
  }
}
