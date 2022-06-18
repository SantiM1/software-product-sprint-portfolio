// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.data;

/** Class containing information statistics. */
public final class Information {

  private final String currentInfo;
  private final String pastInfo;
  private final String futureInfo;

  public Information(String currentInfo, String pastInfo, String futureInfo) {
    this.currentInfo = currentInfo;
    this.pastInfo = pastInfo;
    this.futureInfo = futureInfo;
  }

  public String getCurrentInfo() {
    return currentInfo;
  }

  public String getPastInfo() {
    return pastInfo;
  }
  public String getFutureInfo() {
    return futureInfo;
  }
}