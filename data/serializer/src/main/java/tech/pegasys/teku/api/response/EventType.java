/*
 * Copyright Consensys Software Inc., 2025
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package tech.pegasys.teku.api.response;

import java.util.List;

@SuppressWarnings("JavaCase")
public enum EventType {
  head,
  block,
  attestation,
  voluntary_exit,
  finalized_checkpoint,
  chain_reorg,
  sync_state,
  contribution_and_proof,
  bls_to_execution_change,
  blob_sidecar,
  attester_slashing,
  proposer_slashing,
  payload_attributes,
  block_gossip,
  single_attestation,
  data_column_sidecar;

  public static List<EventType> getTopics(final List<String> topics) {
    return topics.stream().map(EventType::valueOf).toList();
  }
}
